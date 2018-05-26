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
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#listofproducts').addClass('active');
		break;
	default:
		$('#listofproductsg').addClass('active');
		$('#a_'+menu).addClass('active');
	}
	
});