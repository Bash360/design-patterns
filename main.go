package main

import (
	"design-patterns/behavioural"
	"fmt"
)
func main(){

	season:=[]any{
		map[string]any{"title": "Fall From Grace - Ep 1", "duration": "45m", "released": true},
		map[string]any{"title": "Fall From Grace - Ep 2", "duration": "50m", "released": true},
		map[string]any{"title": "Fall From Grace - Ep 3", "duration": "48m", "released": false},
	}
	
  series := behavioural.NewSeries(season)

 fmt.Println(series.Next())
 fmt.Println(series.Next())
 fmt.Println(series.Next())
 fmt.Println(series.Next())
	
}

