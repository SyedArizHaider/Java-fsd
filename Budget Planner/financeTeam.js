function retrieveData(){
    
    var obj = sessionStorage.getItem("obj");
    if(obj==null){
        document.getElementById("out").innerHTML="Sorry...Annual Budget Details not present"
    }else {
        let budgetData = JSON.parse(obj);
        for(let i =0;i<budgetData.length;i++){
            let pTag = document.createElement("p");
            let ptTagValue = document.createTextNode("Client Name is "+budgetData[i].cname+" Project Name is "+budgetData[i].pname+" Budget is "+budgetData[i].budget);
            pTag.appendChild(ptTagValue);
            document.getElementById("result").appendChild(pTag);
        }

    }
}