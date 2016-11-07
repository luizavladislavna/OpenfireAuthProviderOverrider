Building
--------

_**Package:**_

    $ mvn clean package

_**Copy to Openfire:**_

    $ cp target/groupee-auth.jar /opt/openfire/lib/ 
    
_**Go to Openfire `Administration Console` -> `System Properties`:**_
> 1. set `provider.auth.className`=`org.jivesoftware.openfire.auth.HybridAuthProvider`
> 2. set `hybridAuthProvider.primaryProvider.className`=`com.digicode.openfire.auth.TokenAuthProvider`
> 3. set `hybridAuthProvider.secondaryProvider.className`=`org.jivesoftware.openfire.auth.DefaultAuthProvider`
> 4. set `hybridAuthProvider.primaryProvider.api.uri`=`https://...groupee.api/whois/{tokenID}`
     set `hybridAuthProvider.primaryProvider.api.secret`=`api.secret.key for headers`
     set `hybridAuthProvider.primaryProvider.api.method`=`GET` or `POST`
> 5. restart Openfire

       
    


    
