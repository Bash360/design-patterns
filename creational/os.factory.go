package creational

import (
	"fmt"
	"strings"
)


type  OS interface{
	Spec()
}

type spec struct{
	kernel string
	packageManager string
	shell string
}

type Windows struct{
specs spec
}


type Apple struct{
	specs spec
}


type Linux struct{
	specs spec
}


func(w *Windows)Spec(){

fmt.Println(w)
}

func (a *Apple)Spec(){

	fmt.Println(a)
}

func (l *Linux) Spec(){
	fmt.Println(l)
}

func OSFactory(name string) (OS,error){
	switch strings.ToLower(name){
	case "linux":
		return &Linux{
			specs: spec{	kernel:"Monolithic (Linux kernel)",
			packageManager:"apt,yum,pacman",
			shell:"bash,zsh",},
		},nil
	case "windows":
		return &Windows{specs: spec{kernel:"Hybrid NT Kernel",
		packageManager: "Winget",
		shell: "PowerShell"}},nil
	case "apple":
		return &Apple{specs: spec{
			kernel:"Hybrid XNU (Mach + BSD)",
			packageManager:"Homebrew",
			shell:"zsh",
		}},nil
	default:
		return nil, fmt.Errorf("os not recognized",name)
	}
}