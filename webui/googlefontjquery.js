$(document).ready(function () {

    $("button#b1").click(function () {
        $("body").removeClass("bg1");

        $("body").addClass("bg2");
        $("para#p").addClass("p1");



    });

    $("button#b2").click(function () {
        $("body").removeClass("bg2");
        $("body").addClass("bg1");

    });
});
