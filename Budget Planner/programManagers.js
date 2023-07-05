var budgetInfo;
function addData(){
    var ClientName = document.getElementById("cname").value
    var ProjectName = document.getElementById("pname").value;
    var Budget=document.getElementById("budget").value;
    var obj = sessionStorage.getItem("obj");
    let budget = {cname:ClientName,pname:ProjectName,budget:Budget};
    if(obj==null){
        budgetInfo = new Array();
        budgetInfo.push(budget);
        sessionStorage.setItem("obj",JSON.stringify(budgetInfo));
    }else {
        obj = JSON.parse(obj);
        obj.push(budget);
        sessionStorage.setItem("obj",JSON.stringify(obj));
    }
    document.getElementById("cname").value=""
    document.getElementById("pname").value=""
    document.getElementById("budget").value=""
    
    document.getElementById("out").innerHTML="Budget Details Successfully added....."
}