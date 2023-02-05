

//#########################################################
//NAVBAR
//darkLight
let darkLight=()=>{
    document.body.classList.toggle("dark_mode");
}

//TAGS
$(document).ready(function(){
    const apiData=["adana","bursa","ceyhan","malatya","istanbul","izmir","diyarbakır","elazığ"];
    $("#tags").autocomplete({
        source:apiData
    });
});


//#########################################################