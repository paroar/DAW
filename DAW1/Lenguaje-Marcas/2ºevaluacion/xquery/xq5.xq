for $x in doc("bib.xml")//libro
where $x/@anyo>1992 and $x/editorial="Addison-Wesley"
return ($x/titulo/text(), $x/@anyo)