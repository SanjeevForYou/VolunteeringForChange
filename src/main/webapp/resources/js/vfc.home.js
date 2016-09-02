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
                	 	var txt;
                	    var r = confirm("Do you want to confirm Event!");
                	    if (r == true) {
                	    	 vfc.config.Busy = $(this).attr("data-eventid");
                         	//var dta = {"eventid":value};
                             vfc.MarkMemberInterest(vfc.config.Busy);    
                	    }

                });
                
                
            },
     
            MarkMemberInterest: function(dta)
            {
            	   vfc.config.method = "/rest/interest/" + dta;
                   vfc.config.url = contextRoot + vfc.config.method;
                   vfc.config.data = {};
                   vfc.config.ajaxCallMode = 2;
                   vfc.config.type= 'GET';
                   vfc.ajaxCall();
            },

           HandleInterst : function(data)
           {
        	   if(data.member_status === "NOT_LOGGED_IN"){
        		   window.location= contextRoot+"/login";
        	   }
        	   else{
        		   $("#" + vfc.config.Busy).removeClass("btn-primary");
        		   $("#" + vfc.config.Busy).addClass("btn-success");
        	   }
           },
            ajaxSuccess: function (data) {
                switch (vfc.config.ajaxCallMode) {
                    case 0:
                        break;
                    case 1:
                        vfc.BindvfcList(data);
                        break;
                    case 2:
                      vfc.HandleInterst(data);
                        break;
                }
            },
            ajaxCall: function () {
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
                    case 2:
                    	// window.location= contextRoot+"/login";
                    	alert("Something went wrong!!");
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