

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
// FOOTER 

document.getElementById("next_year").innerHTML=new Date().getFullYear();
// $("#next_year").html(new Date().getFullYear());