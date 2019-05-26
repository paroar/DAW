for $x in doc("bib.xml")//libro
where $x/count(autor)>1
return <libro>{$x/@anyo}{$x/titulo}</libro>