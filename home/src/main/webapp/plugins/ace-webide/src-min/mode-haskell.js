define("ace/mode/haskell_highlight_rules",["require","exports","module","ace/lib/oop","ace/mode/text_highlight_rules"],function(e,t,n){"use strict";var r=e("../lib/oop"),i=e("./text_highlight_rules").TextHighlightRules,s=function(){this.$rules={start:[{token:["punctuation.definition.entity.haskell","keyword.operator.function.infix.haskell","punctuation.definition.entity.haskell"],regex:"(`)([a-zA-Z_']*?)(`)",comment:"In case this regex seems unusual for an infix operator, note that Haskell allows any ordinary function application (elem 4 [1..10]) to be rewritten as an infix expression (4 `elem` [1..10])."},{token:"constant.language.unit.haskell",regex:"\\(\\)"},{token:"constant.language.empty-list.haskell",regex:"\\[\\]"},{token:"keyword.other.haskell",regex:"\\bmodule\\b",push:[{token:"keyword.other.haskell",regex:"\\bwhere\\b",next:"pop"},{include:"#module_name"},{include:"#module_exports"},{token:"invalid",regex:"[a-z]+"},{defaultToken:"meta.declaration.module.haskell"}]},{token:"keyword.other.haskell",regex:"\\bclass\\b",push:[{token:"keyword.other.haskell",regex:"\\bwhere\\b",next:"pop"},{token:"support.class.prelude.haskell",regex:"\\b(?:Monad|Functor|Eq|Ord|Read|Show|Num|(?:Frac|Ra)tional|Enum|Bounded|Real(?:Frac|Float)?|Integral|Floating)\\b"},{token:"entity.other.inherited-class.haskell",regex:"[A-Z][A-Za-z_']*"},{token:"variable.other.generic-type.haskell",regex:"\\b[a-z][a-zA-Z0-9_']*\\b"},{defaultToken:"meta.declaration.class.haskell"}]},{token:"keyword.other.haskell",regex:"\\binstance\\b",push:[{token:"keyword.other.haskell",regex:"\\bwhere\\b|$",next:"pop"},{include:"#type_signature"},{defaultToken:"meta.declaration.instance.haskell"}]},{token:"keyword.other.haskell",regex:"import",push:[{token:"meta.import.haskell",regex:"$|;|^",next:"pop"},{token:"keyword.other.haskell",regex:"qualified|as|hiding"},{include:"#module_name"},{include:"#module_exports"},{defaultToken:"meta.import.haskell"}]},{token:["keyword.other.haskell","meta.deriving.haskell"],regex:"(deriving)(\\s*\\()",push:[{token:"meta.deriving.haskell",regex:"\\)",next:"pop"},{token:"entity.other.inherited-class.haskell",regex:"\\b[A-Z][a-zA-Z_']*"},{defaultToken:"meta.deriving.haskell"}]},{token:"keyword.other.haskell",regex:"\\b(?:deriving|where|data|type|case|of|let|in|newtype|default)\\b"},{token:"keyword.operator.haskell",regex:"\\binfix[lr]?\\b"},{token:"keyword.control.haskell",regex:"\\b(?:do|if|then|else)\\b"},{token:"constant.numeric.float.haskell",regex:"\\b(?:[0-9]+\\.[0-9]+(?:[eE][+-]?[0-9]+)?|[0-9]+[eE][+-]?[0-9]+)\\b",comment:"Floats are always decimal"},{token:"constant.numeric.haskell",regex:"\\b(?:[0-9]+|0(?:[xX][0-9a-fA-F]+|[oO][0-7]+))\\b"},{token:["meta.preprocessor.c","punctuation.definition.preprocessor.c","meta.preprocessor.c"],regex:"^(\\s*)(#)(\\s*\\w+)",comment:'In addition to Haskell\'s "native" syntax, GHC permits the C preprocessor to be run on a source file.'},{include:"#pragma"},{token:"punctuation.definition.string.begin.haskell",regex:'"',push:[{token:"punctuation.definition.string.end.haskell",regex:'"',next:"pop"},{token:"constant.character.escape.haskell",regex:"\\\\(?:NUL|SOH|STX|ETX|EOT|ENQ|ACK|BEL|BS|HT|LF|VT|FF|CR|SO|SI|DLE|DC1|DC2|DC3|DC4|NAK|SYN|ETB|CAN|EM|SUB|ESC|FS|GS|RS|US|SP|DEL|[abfnrtv\\\\\\\"'\\&])"},{token:"constant.character.escape.octal.haskell",regex:"\\\\o[0-7]+|\\\\x[0-9A-Fa-f]+|\\\\[0-9]+"},{token:"constant.character.escape.control.haskell",regex:"\\^[A-Z@\\[\\]\\\\\\^_]"},{defaultToken:"string.quoted.double.haskell"}]},{token:["punctuation.definition.string.begin.haskell","string.quoted.single.haskell","constant.character.escape.haskell","constant.character.escape.octal.haskell","constant.character.escape.hexadecimal.haskell","constant.character.escape.control.haskell","punctuation.definition.string.end.haskell"],regex:"(')(?:([\\ -\\[\\]-~])|(\\\\(?:NUL|SOH|STX|ETX|EOT|ENQ|ACK|BEL|BS|HT|LF|VT|FF|CR|SO|SI|DLE|DC1|DC2|DC3|DC4|NAK|SYN|ETB|CAN|EM|SUB|ESC|FS|GS|RS|US|SP|DEL|[abfnrtv\\\\\\\"'\\&]))|(\\\\o[0-7]+)|(\\\\x[0-9A-Fa-f]+)|(\\^[A-Z@\\[\\]\\\\\\^_]))(')"},{token:["meta.function.type-declaration.haskell","entity.name.function.haskell","meta.function.type-declaration.haskell","keyword.other.double-colon.haskell"],regex:"^(\\s*)([a-z_][a-zA-Z0-9_']*|\\([|!%$+\\-.,=</>]+\\))(\\s*)(::)",push:[{token:"meta.function.type-declaration.haskell",regex:"$",next:"pop"},{include:"#type_signature"},{defaultToken:"meta.function.type-declaration.haskell"}]},{token:"support.constant.haskell",regex:"\\b(?:Just|Nothing|Left|Right|True|False|LT|EQ|GT|\\(\\)|\\[\\])\\b"},{token:"constant.other.haskell",regex:"\\b[A-Z]\\w*\\b"},{include:"#comments"},{token:"support.function.prelude.haskell",regex:"\\b(?:abs|acos|acosh|all|and|any|appendFile|applyM|asTypeOf|asin|asinh|atan|atan2|atanh|break|catch|ceiling|compare|concat|concatMap|const|cos|cosh|curry|cycle|decodeFloat|div|divMod|drop|dropWhile|elem|encodeFloat|enumFrom|enumFromThen|enumFromThenTo|enumFromTo|error|even|exp|exponent|fail|filter|flip|floatDigits|floatRadix|floatRange|floor|fmap|foldl|foldl1|foldr|foldr1|fromEnum|fromInteger|fromIntegral|fromRational|fst|gcd|getChar|getContents|getLine|head|id|init|interact|ioError|isDenormalized|isIEEE|isInfinite|isNaN|isNegativeZero|iterate|last|lcm|length|lex|lines|log|logBase|lookup|map|mapM|mapM_|max|maxBound|maximum|maybe|min|minBound|minimum|mod|negate|not|notElem|null|odd|or|otherwise|pi|pred|print|product|properFraction|putChar|putStr|putStrLn|quot|quotRem|read|readFile|readIO|readList|readLn|readParen|reads|readsPrec|realToFrac|recip|rem|repeat|replicate|return|reverse|round|scaleFloat|scanl|scanl1|scanr|scanr1|seq|sequence|sequence_|show|showChar|showList|showParen|showString|shows|showsPrec|significand|signum|sin|sinh|snd|span|splitAt|sqrt|subtract|succ|sum|tail|take|takeWhile|tan|tanh|toEnum|toInteger|toRational|truncate|uncurry|undefined|unlines|until|unwords|unzip|unzip3|userError|words|writeFile|zip|zip3|zipWith|zipWith3)\\b"},{include:"#infix_op"},{token:"keyword.operator.haskell",regex:"[|!%$?~+:\\-.=</>\\\\]+",comment:"In case this regex seems overly general, note that Haskell permits the definition of new operators which can be nearly any string of punctuation characters, such as $%^&*."},{token:"punctuation.separator.comma.haskell",regex:","}],"#block_comment":[{token:"punctuation.definition.comment.haskell",regex:"\\{-(?!#)",push:[{include:"#block_comment"},{token:"punctuation.definition.comment.haskell",regex:"-\\}",next:"pop"},{defaultToken:"comment.block.haskell"}]}],"#comments":[{token:"punctuation.definition.comment.haskell",regex:"--.*",push_:[{token:"comment.line.double-dash.haskell",regex:"$",next:"pop"},{defaultToken:"comment.line.double-dash.haskell"}]},{include:"#block_comment"}],"#infix_op":[{token:"entity.name.function.infix.haskell",regex:"\\([|!%$+:\\-.=</>]+\\)|\\(,+\\)"}],"#module_exports":[{token:"meta.declaration.exports.haskell",regex:"\\(",push:[{token:"meta.declaration.exports.haskell.end",regex:"\\)",next:"pop"},{token:"entity.name.function.haskell",regex:"\\b[a-z][a-zA-Z_']*"},{token:"storage.type.haskell",regex:"\\b[A-Z][A-Za-z_']*"},{token:"punctuation.separator.comma.haskell",regex:","},{include:"#infix_op"},{token:"meta.other.unknown.haskell",regex:"\\(.*?\\)",comment:"So named because I don't know what to call this."},{defaultToken:"meta.declaration.exports.haskell.end"}]}],"#module_name":[{token:"support.other.module.haskell",regex:"[A-Z][A-Za-z._']*"}],"#pragma":[{token:"meta.preprocessor.haskell",regex:"\\{-#",push:[{token:"meta.preprocessor.haskell",regex:"#-\\}",next:"pop"},{token:"keyword.other.preprocessor.haskell",regex:"\\b(?:LANGUAGE|UNPACK|INLINE)\\b"},{defaultToken:"meta.preprocessor.haskell"}]}],"#type_signature":[{token:["meta.class-constraint.haskell","entity.other.inherited-class.haskell","meta.class-constraint.haskell","variable.other.generic-type.haskell","meta.class-constraint.haskell","keyword.other.big-arrow.haskell"],regex:"(\\(\\s*)([A-Z][A-Za-z]*)(\\s+)([a-z][A-Za-z_']*)(\\)\\s*)(=>)"},{include:"#pragma"},{token:"keyword.other.arrow.haskell",regex:"->"},{token:"keyword.other.big-arrow.haskell",regex:"=>"},{token:"support.type.prelude.haskell",regex:"\\b(?:Int(?:eger)?|Maybe|Either|Bool|Float|Double|Char|String|Ordering|ShowS|ReadS|FilePath|IO(?:Error)?)\\b"},{token:"variable.other.generic-type.haskell",regex:"\\b[a-z][a-zA-Z0-9_']*\\b"},{token:"storage.type.haskell",regex:"\\b[A-Z][a-zA-Z0-9_']*\\b"},{token:"support.constant.unit.haskell",regex:"\\(\\)"},{include:"#comments"}]},this.normalizeRules()};s.metaData={fileTypes:["hs"],keyEquivalent:"^~H",name:"Haskell",scopeName:"source.haskell"},r.inherits(s,i),t.HaskellHighlightRules=s}),define("ace/mode/folding/cstyle",["require","exports","module","ace/lib/oop","ace/range","ace/mode/folding/fold_mode"],function(e,t,n){"use strict";var r=e("../../lib/oop"),i=e("../../range").Range,s=e("./fold_mode").FoldMode,o=t.FoldMode=function(e){e&&(this.foldingStartMarker=new RegExp(this.foldingStartMarker.source.replace(/\|[^|]*?$/,"|"+e.start)),this.foldingStopMarker=new RegExp(this.foldingStopMarker.source.replace(/\|[^|]*?$/,"|"+e.end)))};r.inherits(o,s),function(){this.foldingStartMarker=/(\{|\[)[^\}\]]*$|^\s*(\/\*)/,this.foldingStopMarker=/^[^\[\{]*(\}|\])|^[\s\*]*(\*\/)/,this.singleLineBlockCommentRe=/^\s*(\/\*).*\*\/\s*$/,this.tripleStarBlockCommentRe=/^\s*(\/\*\*\*).*\*\/\s*$/,this.startRegionRe=/^\s*(\/\*|\/\/)#?region\b/,this._getFoldWidgetBase=this.getFoldWidget,this.getFoldWidget=function(e,t,n){var r=e.getLine(n);if(this.singleLineBlockCommentRe.test(r)&&!this.startRegionRe.test(r)&&!this.tripleStarBlockCommentRe.test(r))return"";var i=this._getFoldWidgetBase(e,t,n);return!i&&this.startRegionRe.test(r)?"start":i},this.getFoldWidgetRange=function(e,t,n,r){var i=e.getLine(n);if(this.startRegionRe.test(i))return this.getCommentRegionBlock(e,i,n);var s=i.match(this.foldingStartMarker);if(s){var o=s.index;if(s[1])return this.openingBracketBlock(e,s[1],n,o);var u=e.getCommentFoldRange(n,o+s[0].length,1);return u&&!u.isMultiLine()&&(r?u=this.getSectionRange(e,n):t!="all"&&(u=null)),u}if(t==="markbegin")return;var s=i.match(this.foldingStopMarker);if(s){var o=s.index+s[0].length;return s[1]?this.closingBracketBlock(e,s[1],n,o):e.getCommentFoldRange(n,o,-1)}},this.getSectionRange=function(e,t){var n=e.getLine(t),r=n.search(/\S/),s=t,o=n.length;t+=1;var u=t,a=e.getLength();while(++t<a){n=e.getLine(t);var f=n.search(/\S/);if(f===-1)continue;if(r>f)break;var l=this.getFoldWidgetRange(e,"all",t);if(l){if(l.start.row<=s)break;if(l.isMultiLine())t=l.end.row;else if(r==f)break}u=t}return new i(s,o,u,e.getLine(u).length)},this.getCommentRegionBlock=function(e,t,n){var r=t.search(/\s*$/),s=e.getLength(),o=n,u=/^\s*(?:\/\*|\/\/|--)#?(end)?region\b/,a=1;while(++n<s){t=e.getLine(n);var f=u.exec(t);if(!f)continue;f[1]?a--:a++;if(!a)break}var l=n;if(l>o)return new i(o,r,l,t.length)}}.call(o.prototype)}),define("ace/mode/haskell",["require","exports","module","ace/lib/oop","ace/mode/text","ace/mode/haskell_highlight_rules","ace/mode/folding/cstyle"],function(e,t,n){"use strict";var r=e("../lib/oop"),i=e("./text").Mode,s=e("./haskell_highlight_rules").HaskellHighlightRules,o=e("./folding/cstyle").FoldMode,u=function(){this.HighlightRules=s,this.foldingRules=new o,this.$behaviour=this.$defaultBehaviour};r.inherits(u,i),function(){this.lineCommentStart="--",this.blockComment=null,this.$id="ace/mode/haskell"}.call(u.prototype),t.Mode=u})