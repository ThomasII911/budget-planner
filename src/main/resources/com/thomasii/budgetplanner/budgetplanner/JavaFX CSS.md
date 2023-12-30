## Basic JavaFX CSS
### Font
**Font Properties** 

|  CSS Property   |    Values     | Default |
|:---------------:|:-------------:|:-------:|
|    -fx-font     | <font-family> | inherit |
| -fx-font-family | <font-family> | inherit |	 
|  -fx-font-size  |  <font-size>  | inherit |
| -fx-font-style  | <font-style>  | inherit |	 
| -fx-font-weigh  | <font-weight> | inherit |

### Label

Style class: label
: Label has all the properties and pseudo-class state of Labeled.

**Labeled**

<table>
    <tr>
        <th> CSS Property </th>
        <th> Values </th>
        <th> Default </th>
    </tr>
    <tr>
        <td> -fx-alignment </td>
        <td> [ top-left | top-center | top-right | center-left | center | center-right bottom-left | bottom-center 
            <br/> | bottom-right | baseline-left | baseline-center | baseline-right ] </td>
        <td> top-left </td>
    </tr>
    <tr>
        <td> -fx-text-alignment </td>
        <td> [ left | center | right | justify ] </td>
        <td> left </td>
    </tr>
    <tr>
        <td> -fx-text-overrun </td>
        <td> [ center-ellipsis | center-word-ellipsis | clip | 
        <br/> ellipsis | leading-ellipsis | leading-word-ellipsis | word-ellipsis ] 
        </td>
        <td> ellipsis </td>
    </tr>
    <tr> 
        <td> -fx-wrap-text </td>
        <td> [boolean] </td>
        <td> false </td>
    </tr>
    <tr>	 	
        <td> -fx-font </td>
        <td> [font] </td>
        <td> inherits </td>
    </tr>
    <tr>	
        <td> -fx-underline </td>
        <td> [boolean] </td>
        <td> false </td>
    </tr>
    <tr>	
        <td> -fx-graphic </td>
        <td> [uri] </td>
        <td> null </td>
    </tr>
    <tr>	
        <td> -fx-graphic </td>
        <td> [uri] </td>
        <td> null </td>
    </tr>
    <tr> 			
        <td> -fx-content-display </td>
        <td> [ top | right | bottom | left | center | right | graphic-only | text-only ] </td>
        <td> left </td>
    </tr>
    <tr> 	
        <td> -fx-graphic-text-gap </td>
        <td> [size] </td>
        <td> 4 </td>
    </tr>
    <tr> 	
        <td> -fx-label-padding </td>
        <td> [size] | [size] [size] [size] [size] </td>
        <td> [0,0,0,0] </td>
    </tr>
    <tr> 	
        <td> -fx-text-fill </td>
        <td> [paint] </td>
        <td> black </td>
    </tr>
    <tr>
        <td> -fx-ellipsis-string </td>
        <td> [string] </td>
    </tr>
</table>

### HBox
<table> 
    <tr>	
        <th> CSS Property </th>
        <th> Values </th>
        <th> Default </th>
    </tr>
    <tr>	
        <td> -fx-spacing </td>
        <td> [size] </td>
        <td> 0 </td>
    </tr>
    <tr> 		
        <td> -fx-alignment </td>
        <td> [ top-left | top-center | top-right | center-left | center | center-right bottom-left | bottom-center | bottom-right | baseline-left | baseline-center | baseline-right ] </td>
        <td> top-left </td>
    </tr>
    <tr>	
        <td> -fx-fill-height </td>
        <td> [boolean] </td>
        <td> false </td>
    </tr>
</table>

### Node
**Pseudo-classes**

| CSS Pseudo-class |                                    Comments                                    |
|------------------|:------------------------------------------------------------------------------:|
| disabled         |                   applies when the disabled variable is true                   |
| focused          |                   applies when the focused variable is true                    |
| hover            |                    applies when the hover variable is true                     |
| pressed          |                   	applies when the pressed variable is true                   |
| show-mnemonic    | 	apples when the mnemonic affordance (typically an underscore) should be shown |

### Color
**Named Colors <named-color>**
CSS supports a bunch of named constant colors. Named colors can be specified with just their unquoted name for example:
-fx-background-color: <named-color> or rgb() or rgba().

### Webview

| CSS Property             | Values         | Default          |
|--------------------------|----------------|------------------|
| -fx-context-menu-enabled | [boolean]      | true             |
| -fx-font-smoothing-type  | [ gray / lcd ] | lcd              |
| -fx-font-scale           | [number]       | 1                |
| -fx-min-width            | [size]         | 0                |
| -fx-min-height           | [size]         | 0                |
| -fx-pref-width           | [size]         | 800              |
| -fx-pref-height          | [size]         | 600              |
| -fx-max-width            | [size]         | Double.MAX_VALUE |
| -fx-max-height           | [size]         | Double.MAX_VALUE |

### ImageView
| CSS Property | Values | Default | Comment                                                        |
|--------------|--------|---------|----------------------------------------------------------------|
| -fx-image    | 	[uri] | 	null   | 	Relative URLs are resolved against the URL of the stylesheet. |