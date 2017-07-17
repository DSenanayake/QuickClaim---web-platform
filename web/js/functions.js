$(document).ready(function () {
    $('#main-nav a.mdl-navigation__link').click(function () {
        var hash = $(this).attr('href');
        switch (hash) {
            case '#claim':
                loadContent('admin_pages/claim.jsp');
                break;
            case '#coverage':
                loadContent('admin_pages/coverage.jsp');
                break;
            case '#vehicle':
                loadContent('admin_pages/vehicle.jsp');
                break;
            case '#owner':
                loadContent('admin_pages/owner.jsp');
                break;
        }
    });

    function loadContent(url) {
//    alertify.log("Please wait...");
        $.post(url, {}, function (data) {
            $('#main-content').html(data);
        });
    }
});
