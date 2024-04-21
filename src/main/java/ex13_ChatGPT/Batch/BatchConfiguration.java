package ex13_ChatGPT.Batch;


import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.transform.DefaultFieldSet;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {
    //이건 chatgpt가 만든것. 231219


    @Bean
    public Job myJob(JobBuilderFactory jobBuilderFactory, Step myStep) {
        return jobBuilderFactory.get("myJob")
                .start(myStep)
                .build();
    }

    @Bean
    public Step myStep(StepBuilderFactory stepBuilderFactory,
                       ItemReader<String> myReader,
                       ItemProcessor<String, String> myProcessor,
                       ItemWriter<String> myWriter) {
        return stepBuilderFactory.get("myStep")
                .<String, String>chunk(10)
                .reader(myReader)
                .processor(myProcessor)
                .writer(myWriter)
                .build();
    }

    @Bean
    @StepScope
    public ItemReader<String> myReader() {
        String path="C:\\Users\\L-JE01\\Desktop\\test\\input.txt";
        return new FlatFileItemReaderBuilder<String>()
                .name("myReader")
                .resource(new ClassPathResource(path))
                .lineTokenizer(new LineTokenizer() {
                    @Override
                    public FieldSet tokenize(String line) {
                        String[] tokens = line.split(","); // 적절한 구분자로 변경
                        return new DefaultFieldSet(tokens);
                    }
                })
                .fieldSetMapper(fieldSet -> fieldSet.readString(0)) // 필요에 따라 인덱스 변경
                .build();
    }


    @Bean
    public ItemProcessor<String, String> myProcessor() {
        return item -> "Processed: " + item.toUpperCase();
    }

    @Bean
    public ItemWriter<String> myWriter() {
        return items -> {
            for (String item : items) {
                System.out.println("Writing item: " + item);
            }
        };
    }
}
