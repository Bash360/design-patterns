package main

import (
	"design-patterns/creational"
	"fmt"
)
func main(){

	windows,error:=creational.OSFactory("windows")
	if error == nil{
		windows.Spec()
	}
	fmt.Println(error)
	

}

