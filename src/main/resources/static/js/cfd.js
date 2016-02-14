// See http://www.nytimes.com/interactive/2013/02/19/movies/awardsseason/oscar-trailers.html
var workflowStages
var issues

d3.json("api/v1/workflow/stages", (error, data) => {
  if(error) {
    console.log("Error loading workflow stages: " + JSON.stringify(error))
    return
  }
  console.log("Loaded workflow stages: " + JSON.stringify(data))
  workflowStages = data

  tryPopulateCfd()
})

d3.json("api/v1/issues", (error, data) => {
  if(error) {
    console.log("Error loading issues: " + JSON.stringify(error))
    return
  }
  console.log("Loaded issues: " + JSON.stringify(data))
  issues = data

  tryPopulateCfd()
})

function tryPopulateCfd() {
  if(!workflowStages || !issues) {
    return
  }
  console.log("Loaded issues and workflow stages")
}