$(document).ready(function() {
    $('.Slideshow').slick({
        autoplay: true,
        autoplaySpeed: 4000,
        centerMode: true,
        infinite: true,
        slidesToShow: 2,
        slidesToScroll: 2,
        centerMode: true,
        pauseOnHover: true,
        swipe: false,
        responsive: [{
            breakpoint: 600,
            settings: {
                slidesToShow: 1,
                slidesToScroll: 1,
                infinite: true,
                dots: true
            }
        }]
    });
});