clean:
	lein clean
init_clojupyter:
	cd clojupyter; make
remove_kernel:
	-lein clojupyter remove-install dataframe
add_kernel:
	lein uberjar;
	make remove_kernel;
	lein clojupyter install --ident dataframe --jarfile target/dataframe-0.1.0-SNAPSHOT-standalone.jar;

