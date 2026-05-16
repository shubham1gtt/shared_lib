def call(){
 timeout(time: 1, unit: "MINUTES") {
   waitForQualityGate abortPipeline: false
 } 
}
--- "Wait maximum 1 minute for SonarQube Quality Gate result.
Even if Quality Gate fails, do not stop the pipeline." ---
  
timeout(time: 1, unit: "MINUTES") --> 
  This is a Jenkins Pipeline step.
It limits execution time.
If the block inside takes longer than: 1 MINUTE
then Jenkins automatically stops it.
 
  Why timeout is important?

Sometimes:
SonarQube server hangs
Network issue happens
Quality Gate response never comes

Without timeout:
pipeline may wait forever
Timeout protects the pipeline.


  
   waitForQualityGate abortPipeline: false -->
  
It waits for:
SonarQube analysis result
Quality Gate status


