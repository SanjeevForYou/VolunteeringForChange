(function ($) {
    var offset = 1;
    var limit;
    var current;
    var currentPage;
    var container;
    var contextRoot = "/" + window.location.pathname.split('/')[1];
    var eventid;
    var memberid;
    var approveid;
    $.Showvfc = function (p) {
        p = $.extend
                ({}, p);

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
                $(".user_approval").on('change', function () {
                	 	var txt;
                	    var r = confirm("Do you want to change approval?");
                	    if (r == true) {
                	    	eventid = $(this).attr("data-eventid");
                	    	memberid = $(this).attr("data-userid");
                	    	approveid = $(this).val();
         
                	       vfc.config.data = JSON.stringify({"eventid" : eventid , "memberid": memberid,"approval" : approveid});
                             vfc.MarkMemberApprove();    
                	    }

                });
                
                
            },
     
            MarkMemberApprove: function(dta)
            {
            	   vfc.config.method = "/admin/memberEvent/approve"
                   vfc.config.url = contextRoot + vfc.config.method;
                   vfc.config.ajaxCallMode = 2;
                   vfc.config.type= 'PUT';
                   vfc.ajaxCall();
            },
            
            ajaxSuccess: function (data) {
                switch (vfc.config.ajaxCallMode) {
                    case 0:
                        break;
                    case 1:
                        vfc.BindvfcList(data);
                        break;
                    case 2:
                      
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
                    	alert("Something went wrong!!");
                        break;
                }
            }

        };
        vfc.init();
    };

    $.fn.vfc_admin_event = function (p) {
        $.Showvfc(p);
    };
})(jQuery);