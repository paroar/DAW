for $x in doc("bib.xml")//libro
where $x/precio=65.95
return $x/titulo/text()