var items = ['tea', 'coffee', 'milk'];
var flag = true;

$(document).ready(function () {

    $("button").addClass('btn btn-primary');

    $("button#b1").click(function () {
        alert('You clicked the button');
    });

    $("button#b2").click(function () {
        $('#para').addClass('text-danger');
    });
