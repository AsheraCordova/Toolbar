# Toolbar

Toolbar project adds support for android Toolbar widget.

## Installation
To install the plugin use:

```
cordova plugin add https://github.com/AsheraCordova/Toolbar.git
```

## Important Links
https://asheracordova.github.io/

https://asheracordova.github.io/doc/help-doc.html

https://asheracordova.github.io/doc/androidx/appcompat/widget/Toolbar.html

https://asheracordova.github.io/playground/index.html

## Features
The toolbar supports the following features:
* Menu with showAction support
* Responsive layout
* Support for SearchView
* Support for group support
* Support for actionlayout

Roadmap:
* Support for collapse icon
* Child widget support

### Custom Attributes

Name                	| Description
-------------       	| -------------
actionLayoutEventIds  | Click events ids to be added to the child widgets when using a custom action layout.
searchview_attributes | Attributes to customize the autocomplete in search view. e.g. searchview_attributes="listitem: @layout/autocomplete_item;completionThreshold:0;modelFor:let item in looptest.textlayout from testObj->view into loopvar as pathmap;modelIdPath=id;modelDescPath:a"				
