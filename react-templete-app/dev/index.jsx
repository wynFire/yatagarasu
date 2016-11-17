import React from "react";
import ReactDOM from "react-dom";

var HelloWord = React.createClass({
	render:function() {
		return (
			<div>Hello,{this.props.greetTarget}</div>
		);
	}
});

ReactDOM.render(
     <div>
     	<HelloWord greetTarget="Daisy"/>
     	<HelloWord greetTarget="Daisy1"/>
     	<HelloWord greetTarget="Daisy2"/>
     	<HelloWord greetTarget="Daisy3"/>
     	<HelloWord greetTarget="Daisy4"/>
     	<HelloWord greetTarget="Daisy5"/>
     </div>,
     document.querySelector("#container")
);