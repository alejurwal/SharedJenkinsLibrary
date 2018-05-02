def call( ) { 
try { 
sh 'echo Hello' 
sh 'echo Hii' 
} catch (Exception err) { 
currentBuild.result = 'FAILED' 
throw new RuntimeException(err) 
} 
echo "End of the build" 
}
