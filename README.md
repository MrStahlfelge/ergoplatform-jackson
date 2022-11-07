## ergoplatform model library for jackson

This library provides Jackson serializer models for ErgoPay and ErgoAuth. Best suitable to be used
in Spring projects.

The library modules are released on Jitpack. To add it to your environment, make sure Jitpack 
is in your repositories list:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Add the library like follows:

    implementation 'com.github.MrStahlfelge:ergoplatform-jackson:$version'

