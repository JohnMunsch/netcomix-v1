
// usage: log('inside coolFunc', this, arguments);
// paulirish.com/2009/log-a-lightweight-wrapper-for-consolelog/
window.log = function(){
  log.history = log.history || [];   // store logs to an array for reference
  log.history.push(arguments);
  arguments.callee = arguments.callee.caller;  
  if(this.console) console.log( Array.prototype.slice.call(arguments) );
};
// make it safe to use console.log always
(function(b){function c(){}for(var d="assert,count,debug,dir,dirxml,error,exception,group,groupCollapsed,groupEnd,info,log,markTimeline,profile,profileEnd,time,timeEnd,trace,warn".split(","),a;a=d.pop();)b[a]=b[a]||c})(window.console=window.console||{});


// place any jQuery/helper plugins in here, instead of separate, slower script files.

/**
 * loupe - an image magnifier for jQuery
 * (C) 2010 jdbartlett, MIT license
 * http://github.com/jdbartlett/loupe
 */
(function ($) {
	$.fn.loupe = function (arg) {
		var options = $.extend({
			loupe: 'loupe',
			width: 200,
			height: 150
		}, arg || {});

		return this.length ? this.each(function () {
			var $this = $(this), $big, $loupe,
				$small = $this.is('img') ? $this : $this.find('img:first'),
				move, hide = function () { $loupe.hide(); },
				time;

			if ($this.data('loupe') != null) {
				return $this.data('loupe', arg);
			}

			move = function (e) {
				var os = $small.offset(),
					sW = $small.outerWidth(),
					sH = $small.outerHeight(),
					oW = options.width / 2,
					oH = options.height / 2;

				if (!$this.data('loupe') ||
					e.pageX > sW + os.left + 10 || e.pageX < os.left - 10 ||
					e.pageY > sH + os.top + 10 || e.pageY < os.top - 10) {
					return hide();
				}

				time = time ? clearTimeout(time) : 0;

				$loupe.show().css({
					left: e.pageX - oW,
					top: e.pageY - oH
				});
				$big.css({
					left: -(((e.pageX - os.left) / sW) * $big.width() - oW)|0,
					top: -(((e.pageY - os.top) / sH) * $big.height() - oH)|0
				});
			};

			$loupe = $('<div />')
				.addClass(options.loupe)
				.css({
					width: options.width,
					height: options.height,
					position: 'absolute',
					overflow: 'hidden'
				})
				.append($big = $('<img />').attr('src', $this.attr($this.is('img') ? 'src' : 'href')).css('position', 'absolute'))
				.mousemove(move)
				.hide()
				.appendTo('body');

			$this.data('loupe', true)
				.mouseenter(move)
				.mouseout(function () {
					time = setTimeout(hide, 10);
				});
		}) : this;
	};
}(jQuery));