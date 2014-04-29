define(function(require, exports, module){

    var $ = require('jquery');

    var CONTENT_LENGTH = 140;
    var IMAGE_SIZE = 4;
    var TAG_SIZE = 5;

    function Tweet(options) {
        this.options = options || {};
        this.tweetId = 0;
        this.content = this.options.content || null;
        this.images = this.options.images || null;
        this.tags = this.options.tags || null;
        this.category = 0;
        this.source = 0;
        this.userId = null;
        this.init();
    }

    module.exports = Tweet;


    Tweet.prototype.init = function () {
        this.validator();
    };

    Tweet.prototype.validator = function () {
        if (this.content == null || this.content.length < CONTENT_LENGTH) {
            console.log('===== 您的长度不够 =====' + this.content);
            return;
        }
        add();
    }

    Tweet.prototype.add = function () {
        console.log('----------------- OK -----------------');
    }

});