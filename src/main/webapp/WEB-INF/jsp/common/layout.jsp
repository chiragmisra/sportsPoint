<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <title><tiles:insertAttribute name="title" ignore="true" /></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">  
    
    <link href="<c:url value='/resources/scripts/bootstrap/css/bootstrap.min.css'/>" rel="stylesheet">
    <link href="<c:url value='/resources/scripts/bootstrap/css/bootstrap-responsive.min.css'/>" rel="stylesheet">

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Icons -->
    <link href="<c:url value='/resources/scripts/icons/general/stylesheets/general_foundicons.css'/>" media="screen" rel="stylesheet" type="text/css" />  
    <link href="<c:url value='/resources/scripts/icons/social/stylesheets/social_foundicons.css'/>" media="screen" rel="stylesheet" type="text/css" />
    <!--[if lt IE 8]>
        <link href="<c:url value='/resources/scripts/icons/general/stylesheets/general_foundicons_ie7.css'/>" media="screen" rel="stylesheet" type="text/css" />
        <link href="<c:url value='/resources/scripts/icons/social/stylesheets/social_foundicons_ie7.css'/>" media="screen" rel="stylesheet" type="text/css" />
    <![endif]-->
    <link rel="stylesheet" href="<c:url value='/resources/scripts/fontawesome/css/font-awesome.min.css'/>">
    <!--[if IE 7]>
        <link rel="stylesheet" href="<c:url value='/resources/scripts/fontawesome/css/font-awesome-ie7.min.css'/>">
    <![endif]-->

<link href="<c:url value='/resources/scripts/carousel/style.css'/>" rel="stylesheet" type="text/css" /><link href="<c:url value='/resources/scripts/tweet/jquery.tweet.css'/>" rel="stylesheet" type="text/css" /><link href="<c:url value='/resources/scripts/camera/css/camera.css'/>" rel="stylesheet" type="text/css" />

    <link href="http://fonts.googleapis.com/css?family=Carter+One" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Aclonica" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Cuprum" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Palatino+Linotype" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Georgia" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Terminal+Dosis+Light" rel="stylesheet" type="text/css">

    <link href="<c:url value='/resources/styles/custom.css'/>" rel="stylesheet" type="text/css" />
</head>
<body id="pageBody">

<tiles:insertAttribute name="header" />

<tiles:insertAttribute name="body" />



<div id="footerOuterSeparator"></div>

<tiles:insertAttribute name="footer" />

<script src="<c:url value='/resources/scripts/jquery.min.js'/>" type="text/javascript"></script> 
<script src="<c:url value='/resources/scripts/bootstrap/js/bootstrap.min.js'/>" type="text/javascript"></script>
<script src="<c:url value='/resources/scripts/default.js'/>" type="text/javascript"></script>


<script src="<c:url value='/resources/scripts/carousel/jquery.carouFredSel-6.2.0-packed.js'/>" type="text/javascript"></script><script type="text/javascript">$('#list_photos').carouFredSel({ responsive: true, width: '100%', scroll: 2, items: {width: 320,visible: {min: 2, max: 6}} });</script><script src="<c:url value='/resources/scripts/tweet/jquery.tweet.js'/>" type="text/javascript"></script><script type="text/javascript">$('#recent_tweets').tweet({avatar_size: 24, count: 3, fetch: 20, username: 'bootstrapdsgn'});</script>
<script src="<c:url value='/resources/scripts/camera/scripts/camera.min.js'/>" type="text/javascript"></script>
<script src="<c:url value='/resources/scripts/easing/jquery.easing.1.3.js'/>" type="text/javascript"></script>
<script type="text/javascript">function startCamera() {$('#camera_wrap').camera({ fx: 'random', time: 2000, loader: 'none', playPause: false, height: '65%', pagination: true });}$(function(){startCamera()});</script>


</body>
</html>