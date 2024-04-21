//DOM선택
const playground = document.querySelector(".playground > ul");

console.log('playground>>',  playground)

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
    direction : 3,
    top:0,
    left:0
}

init();

//functions
function init(){
    tempMovingItem = {...movingItem}; //type, direction,top, left를 가짐.

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
    const {type, direction,top, left} = tempMovingItem;

    BLOCKS[type][direction].forEach( block => { //[[1,2],[0,1],[2,1],[1,1]],
        const x = block[0]; // 각 블럭에서 첫번째 1,0,2,1
        const y = block[1];// 각 블럭에서 두번째 2,1,1,1

        const target1 = playground.childNodes[y].childNodes[0].childNodes[x];
        console.log('target1>>', target1)
        const target = playground.childNodes[y] ? playground.childNodes[y].childNodes[0].childNodes[x] : null;
        //console.log('target>>', target)
    })
}