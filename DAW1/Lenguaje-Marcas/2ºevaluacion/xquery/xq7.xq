for $x in doc("bib.xml")//libro
where empty ($x/autor)
return <libro>{$x/@anyo}{$x/titulo}</libro>