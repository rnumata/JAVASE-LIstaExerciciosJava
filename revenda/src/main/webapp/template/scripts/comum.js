$(function() {
	try {
		var page = window.location.pathname.split("/").pop();
		$('a[href=\'' + page + '\']').addClass('selected');
	} catch (e) {
		// nada a fazer
	}
});
