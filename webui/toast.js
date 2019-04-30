
// function showToast() {
//     document.getElementById("toast").style.display = "block";
//     // setTimeout(() => {
//     // document.getElementById("toast").style.display = "none";        
//     // }, 2000);

//     setTimeout(function () {
//         document.getElementById("toast").style.display = "none";
//     }, 2000);

// }
function showToast(){
document.getElementById("toast").style.display="block";

document.getElementById("btn").disabled = true;

setTimeout(function(){
document.getElementById("toast").style.display="none";
document.getElementById("btn").disabled = false;

},2000);
}




// <button onclick="myFunction()">Try it</button>

// <script>
// function myFunction() {
//   document.getElementById("myBtn").disabled = true;
// }
// </script>













// function itemInput(){
//     if(document.getElementById("newItem").value != ""){
//         document.getElementById('bid').disabled = false;
//     }
//     else{
//         document.getElementById('bid').disabled = true;
//     }
// }