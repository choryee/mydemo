
    function checkLogin(){
        var uid=get('userid'),
            upw=get('userpw');
        console.log('>>>>>>>', 'uid=',uid,', upw=', upw);

        function docFind(tag){
            return document.getElementById(tag);
        }

        var frm=docFind('frm');
        var msg=docFind('msg');
        var err=docFind('err');

        //밑에 함수 정의는 틀린 듯.
        function styleDisplay(tag, noneorblock){ //틀림
            return tag.style.display=noneorblock;
        }

        function showorhide(id){ // 틀림
            return id.show
        }

        function showId(id){
          var cid=document.getElementById(id);
          return cid.show();
        }

        function showId1(id){
            var cid=$(id);
            return cid.show();
        }

        function hideId(id){
            var hid=document.getElementById(id);
           return hid.hide();
        }


        if(uid==='a' && upw==='1'){
          //  frm.style.display='none';
           // styleDisplay(frm, 'block');
            
            frm.style.display='none';
           // hideId('frm');
            msg.style.display='block';
           // showId('msg');
            err.style.display='none';
           // hideId('err');
        }else{
            frm.style.display='none';
           // hideId('frm');
            msg.style.direction='none';
          //  hideId('msg');
            err.style.display='block';
           // showId('err');
        }

        return false;
     }

     function get(id){
        return document.getElementById(id).value;
     }
