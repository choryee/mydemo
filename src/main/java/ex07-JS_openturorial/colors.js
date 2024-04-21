
  var Links={
    setColor:function(color){ //29강.
    // var links=document.querySelectorAll('a');
    // var i=0;
    // while(i<links.length){
    //     links[i].style.color=color;
    //     i++;
    // }

    $('a').css('color', color); //35강 중간.

}
}

// function LinksSetColor(color){ //29강.
//     var links=document.querySelectorAll('a');
//     var i=0;
//     while(i<links.length){
//         links[i].style.color=color;
//         i++;
//     }
// }

var Body={ //33강.첨. 객체에 '함수'로 담으려는 것.
    setColor:  function(color){
    document.querySelector('body').style.color=color;
},
    setBackgroundColor:function(color){
    document.querySelector('body').style.backgroundColor='black';
}

}


// function BodySetColor(color){
//     document.querySelector('body').style.color=color;
// }

// function BodySetBackgroundColor(color){
//     document.querySelector('body').style.backgroundColor='black';
// }


function nightDayHandler(self){
var target=document.querySelector('body');
if(self.value === 'night'){
   // BodySetBackgroundColor('white') //33강. 객체로 한것.
   Body.setBackgroundColor('white')
   // BodySetColor('white');
    Body.setColor('white');
    self.value='day';

    //LinksSetColor('powderblue');    
    Links.setColor('powderblue');     

}else {
   // BodySetBackgroundColor('white')
    Body.setBackgroundColor('white')
   // BodySetColor('red');
    Body.setColor('red');
    self.value='night';

   // LinksSetColor('blue');
    Links.setColor('blue');
}
}