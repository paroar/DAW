(:let $x:=doc("bib.xml")/bib/libro/titulo | doc("bib.xml")/bib/libro/autor 
return <result>{data($x)}</result>:)

for $x in doc("bib.xml")/bib/libro
let $z:=(for $y in $x/autor/nombre return {$y})
return <result>{string($z)}</result>