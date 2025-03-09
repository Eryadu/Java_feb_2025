Key Differences:

Feature	           String	                 StringBuffer	                              StringBuilder
Mutability	      Immutable	                    Mutable	                                    Mutable
Performance	     Slow for modifications	    Faster than String(Synchronized)	        Fastest (not synchronized)
Thread Safety	     N/A	                 Thread-safe (synchronized)	                 Not thread-safe
Use Case	     Fixed strings	      Frequent modifications + thread safety	  Frequent modifications (no thread safety)
