# KotlinCompat

Dies ist eine Kotlin Bibliothek, die es ermöglicht die Api des Servers einfacher
zu nutzen. Es muss lediglich die Url des Serves angegeben werden. Dann können
die Methoden der Api direkt genutzt werden.

'''
val server = Server("example.com")
val msg = server.getPing()
'''

Schema:
| Methode | Datentyp |
| :------ | --: |
| getPing() | String |
