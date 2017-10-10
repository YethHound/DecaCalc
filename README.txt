To run:
1. download decacalc.jar
2. run the jar from the command line (java -jar decacalc.jar)

3. localhost:8080/decacalc contains the ui version

4. localhost:8080/apicalc can be used by giving it result and eventName arguments
for example http://localhost:8080/apicalc?result=10.0&eventName=100m

Result is a double that represents seconds in running events , centimeters in jumping events (including pole vault)
and meters in throwing events

eventName is one of the following 100m, Long_jump, Shot_put, High_jump, 400m, 110m_hurdles, Discus_throw, Pole_vault, 
Javelin_throw, 1500m
