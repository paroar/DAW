for $x in doc("bib.xml")//libro
where $x/@anyo<2000
return $x/titulo/text()