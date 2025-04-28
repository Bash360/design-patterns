package main

import (
	"design-patterns/creational"
)
func main(){
	db := creational.NewDBConnection()

	db.CreateConnection("postgres://localhost:5432/mydb")


	db.CreateConnection("postgres://localhost:5432/anotherdb")
}

