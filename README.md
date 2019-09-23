# VarelaAndroidTools

VarelaAndroidTools is an android library developed to speed up the process of android apps creation. The library include a lot of features to keep your code clean and avoid loose time searching for some features. The aim of VarelaAndroidTools are:

  - Simplify the code;
  - Avoid write a class in each project you always use;
  - Guarantee the organization of code using a specific structure;

## Installation

#### Add the JitPack repository to your build file:

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

#### Add dependency:
```
dependencies {
    implementation 'com.github.mrkali:VarelaAndroidTools:0.6'
}
```

# Documentation
## Appeareance
This class contatins a lot of functions to change the appearance of your app. You should start by create an instance of it:
```
private Appearance appearance;

@Override
protected void onCreate(){
  appearance = new Appearance(this);
}
```

### Change color of status bar
If you want to use your own color in status bar, you should use the follow code

```
appearance.changeColorOfStatusBar(R.color.myCustomColor);
```


## Network
This class is used to handle events related to network
```
private Network network;

@Override
protected void onCreate(){
  network = new Network(this);
}
```

### Check network connection 
To check the network connection in that exactly moment, you can use the follow functions, which return a boolean:
```
if (network.isConnectedToNetwork()){
  // returned true, is connected
  Toast.makeText(context, "Is connected to network", Toast.LENGTH_SHORT).show();
}else{
  // returned false, isn't connected
  Toast.makeText(context, "Isn't connected to network", Toast.LENGTH_SHORT).show();
}
```

## Todos

 - Add listener to network changes
 - Add implementation to Room Database
 - Camera utils
 - Volley request utils

License
----

MIT


**Free Software, Hell Yeah!**

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)


   [dill]: <https://github.com/joemccann/dillinger>
   [git-repo-url]: <https://github.com/joemccann/dillinger.git>
   [john gruber]: <http://daringfireball.net>
   [df1]: <http://daringfireball.net/projects/markdown/>
   [markdown-it]: <https://github.com/markdown-it/markdown-it>
   [Ace Editor]: <http://ace.ajax.org>
   [node.js]: <http://nodejs.org>
   [Twitter Bootstrap]: <http://twitter.github.com/bootstrap/>
   [jQuery]: <http://jquery.com>
   [@tjholowaychuk]: <http://twitter.com/tjholowaychuk>
   [express]: <http://expressjs.com>
   [AngularJS]: <http://angularjs.org>
   [Gulp]: <http://gulpjs.com>

   [PlDb]: <https://github.com/joemccann/dillinger/tree/master/plugins/dropbox/README.md>
   [PlGh]: <https://github.com/joemccann/dillinger/tree/master/plugins/github/README.md>
   [PlGd]: <https://github.com/joemccann/dillinger/tree/master/plugins/googledrive/README.md>
   [PlOd]: <https://github.com/joemccann/dillinger/tree/master/plugins/onedrive/README.md>
   [PlMe]: <https://github.com/joemccann/dillinger/tree/master/plugins/medium/README.md>
   [PlGa]: <https://github.com/RahulHP/dillinger/blob/master/plugins/googleanalytics/README.md>
