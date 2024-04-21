// 추억의 게임! 테트리스 HTML, Javascript로 만들기



//DOM선택
const playground = document.querySelector(".playground >ul");

//console.log(playground)

//setting
const GAME_ROWS=20;
const GAME_COLS=10;

//variables
let score=0;
let duration=500;
let downInterval;
let tempMovingItem;

const BLOCKS={ //14:28
    tree:[
        [[2,1],[0,1],[1,0],[1,1]],
        [[1,2],[0,1],[1,0],[1,1]],
        [[1,2],[0,1],[2,1],[1,1]],
        [[2,1],[1,2],[1,0],[1,1]]
    ]
}

const movingItem={ // const상수라서 여기처럼,위 let과 달리 초기화 해야
    type : "tree",
    direction : 0,
    top : 0,
    left : 0
}



init();

//functions
function init(){
    for(let i=0; i<GAME_ROWS; i++){
        prependNewLine();
    }
 renderBlocks();
}


function prependNewLine(){
    const li = document.createElement('li');
    const ul = document.createElement('ul');
    for(let j=0; j<GAME_COLS; j++){
        const matrix = document.createElement('li');
        ul.prepend(matrix);
    }
    li.prepend(ul);
    playground.prepend(li);
}

function renderBlocks(){
    const tempMovingItem = {...movingItem};
    const {type, direction,top, left} = tempMovingItem; //type, direction,top, left를 가진 
    // const type = tempMovingItem.type; //tempMovingItem.type->tree

    //밑이 방향키로 이동시 class를 제거하는 것.
    //movingBlocks.forEach(moving=>{


    //})

    BLOCKS[type][direction].forEach(block =>{
        const x=block[0]
        const y=block[1]
        console.log('playground>>', playground); // 각 한 행 전체.
        console.log('x>>', x); // 각 한 행 전체.
        console.log('playground.childNodes[x]>>', playground.childNodes[x]); // 각 한 행 전체.
        console.log('y>>', y); // 각 한 행 전체.
        console.log('playground.childNodes[y]>>', playground.childNodes[y]); // 각 한 행 전체.
        console.log(' playground.childNodes[y].childNodes[x]>>',  playground.childNodes[y].childNodes[x]); // 각 한 행 전체.
        const target = playground.childNodes[y].childNodes[0].childNodes[x];
        console.log('target>>', target); // 각 한 행 전체.
    })



    //});


}//renderBlocks()

function seizeBlock(){

}

function checkEmpty(target){

}

function moveBlock(moveType, amount){
    return  movingItem[moveType] +=amount;
}

function changeDirection(){

}

//event handling
// 키 화살표 누를때, e.keycode를 사용
document.addEventListener("keydown", e=>{
    console.log('e>>', e);
    switch (e.keyCode){
        case 40 :
            console.log('down 누름');

            break;
        case 38 :
            moveBlock('top', 1);
            console.log('top 누름');
            console.log(moveBlock('top', 1));
            break;
        case 39 :

            console.log('right 누름');
            break;
        case 37 :
            console.log('left 누름');
            break;
    }
})

const book={
    title: 'JS',
    pages: 500
}

const bookItem={
    type1: 'title',

}

book.publishdate='2024-02-05';
console.log('book>>', book["title"]);
console.log("book['publishdate'] >>", book["publishdate"] )

const {type1}=bookItem;
console.log('type1>>', book[type1]);

const aa= 4>5 ? 'a':'b';
console.log('aa>>', aa);

const myBook={...book};
const {title, pages}=book;
console.log('title>>', title);