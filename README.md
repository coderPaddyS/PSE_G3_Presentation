# Repository
Dieses Repository ist Teil eines PSE-Projekt der KIT Universität, Institut KASTEL und unter der GPL3.0-or-later Lizenz veröffentlicht und somit zur Nutzung freigegeben.

# PSE
Dieses Repository beinhaltet Präsentationsfolien zum PSE Projekt "KIT-Raumfinder"
Zur Compilierung wird eine installierte LaTeX Umgebung mit `latexmk` und `shell-escape` benötigt.

# Kompilierungsmindestanforderungen
Um den Sourcecode zu kompilieren werden diverse Systemvoraussetzungen benötigt. Zum einen natürlich eine lokale LaTeX-Umgebung, die in der Lage ist `latexmk` mit `shell-escape` auszuführen.

# Module
Die Präsentationen befinden sich in ihren eigenen Ordnern. Eine Präsentation ist in einzelne Kapitel und Unterkapitel bzw. Module und Submodule untergliedert. Diese können ausgehend von der Hauptdatei `.Präsentation/main.tex` per `\inpmod` eingebunden werden, so bindet `\inpmod{Kriterien}` das Kapitel `Präsentation/Kapitel/Kriterien` ein. Um in einem Modul ein relatives Submodul einzubinden, kann hierfür `\inprelmod` gleichermaßen verwendet werden.
Um andere, zur momentan bearbeiteten Datei, relative Dateien einzubinden, kann `\relfile` genutzt werden, um zur Compilezeit den richtigen, absoluten Pfad zu bekommen.
Bilddateien im direkten Subordner `images` können über `\relimgfile` eingebunden werden. Bsp: Um `images/bild01.png` einzubinden, kann `\includegraphics{\relimgfile{bild01.png}}` verwendet werden.
Hierbei ist zu beachten, dass die Verwendung von `fragile` dieses relative Einbinden innerhalb der Umgebung unterbindet. `fragile` ist jedoch gelegentlich nötig, zum Beispiel für die Verwendung von `\verb`atim Text.

## Aufbau eines Moduls
Ein Modul besteht mindestes aus einer `main.tex` Datei, welche den Inhalt des Moduls bestimmt. Sollte das Modul aus Submodulen bestehen, so soll die `main.tex` dieses Moduls nur als Einbindungsdatei für die Submodule dienen, um die Struktur dieses Repos einzuhalten.
Andernfalls kann die `main.tex` beliebigen Inhalt beschreiben, jedoch sollte dieser thematisch natürlich zum Modul passen.

# Empfehlungen
Für die Erstellung von Folien empfiehlt sich die Beispiel-Präsentation anzuschauen.