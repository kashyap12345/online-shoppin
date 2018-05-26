$(function(){
	
	//solve active menu
	switch(menu){
	
	case 'Home':
		$('#home').addClass('active');
		break;
		
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contactt').addClass('active');
		break;
	default:
		$('#home').addClass('active');
	}
	
});