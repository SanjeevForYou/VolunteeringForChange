(function ($) {
    var offset = 1;
    var limit;
    var current;
    var currentPage;
    var container;
    var contextRoot = "/" + window.location.pathname.split('/')[1];
    $.Showvfc = function (p) {
        p = $.extend
                ({
                    rowTotal: '',
                    UserModuleID: '',
                    PageLimit: '',
                    CategoryID: ''
                }, p);

        var vfc = {
            config: {
                isPostBack: false,
                async: false,
                cache: false,
                type: 'POST',
                contentType: "application/json; charset=utf-8",
                data: '{}',
                dataType: 'json',
                baseURL: contextRoot + "",
                method: "",
                url: "",
                ajaxCallMode: 0,
                Busy: 0
            },

            init: function (config) {
                
                $(".interested").on('click', function () {
                    var value = $(this).attr("data-eventid");
                	var dta = {"eventid":value};
                    vfc.MarkMemberInterest(value);
                });
            },
     
            MarkMemberInterest: function(dta)
            {
            	   vfc.config.method = "/rest/interest/" + dta;
                   vfc.config.url = contextRoot + vfc.config.method;
                   vfc.config.data = {};
                   vfc.config.ajaxCallMode = 2;
                   vfc.ajaxCall(vfc.config);
            },

           HandleInterst : function(data)
           {
        	   
           },
            ajaxSuccess: function (data) {
                switch (vfc.config.ajaxCallMode) {
                    case 0:
                        break;
                    case 1:
                        vfc.BindvfcList(data);
                        break;
                    case 2:
                      alert("posted succcesfully");
                      vfc.HandleInterst(data);
                        break;
                }
            },
            ajaxCall: function (config) {
                $.ajax({
                    type: vfc.config.type,
                    contentType: vfc.config.contentType,
                    cache: vfc.config.cache,
                    async: vfc.config.async,
                    url: vfc.config.url,
                    data: vfc.config.data,
                    dataType: vfc.config.dataType,
                    success: vfc.ajaxSuccess,
                    error: vfc.ajaxFailure
                });
            },

            ajaxFailure: function () {
                switch (vfc.config.ajaxCallMode) {
                    case 0:
                        break;
                    case 1:
                        break;
                }
            }

        };
        vfc.init();
    };

    $.fn.vfc_home = function (p) {
        $.Showvfc(p);
    };
})(jQuery);