define(function (require, exports, module) {
    var $ = require('jquery');
    $('#global-search').on('focus', function () {
        $(this).animate({
            width: "320px"
        }, 500);
    }).on('blur', function () {
        $(this).animate({
            width: "170px"
        }, 500);
    });

    var Tweet = require('/js/tweet');
    // 发布tweet
    $('#publish-tweet-box button[name="add"]').on('click', function () {
        //var content = $('#publish-tweet-box .modal-body .tweet-box').val();
        var content = "测试...";
        var options = {
            content : content
        };
        Tweet = new Tweet(options);
    });
});