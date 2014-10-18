#!/bin/sh
VIRGO_LOCATION=/opt/virgo
VIRGO_REPOSITORY_LOCATION=$VIRGO_LOCATION/repository
VIRGO_REPOSITORY_USR=$VIRGO_REPOSITORY_LOCATION/tarsusdata-usr	
VIRGO_REPOSITORY_EXT=$VIRGO_REPOSITORY_LOCATION/tarsusdata-ext	
VIRGO_PICKUP=$VIRGO_LOCATION/pickup	
rm $VIRGO_REPOSITORY_USR/*;
rm $VIRGO_REPOSITORY_EXT/*;
for file in `find . -name *.jar -print |grep target`; do
	cp $file $VIRGO_REPOSITORY_USR;
done

cp ./lib/usr/* $VIRGO_REPOSITORY_USR/;
cp ./lib/ext/* $VIRGO_REPOSITORY_EXT/;
cp ./etc/plan/tarsusdata.plan $VIRGO_PICKUP/; 
cp ./etc/plan/tarsusdata_ext.plan $VIRGO_REPOSITORY_EXT/;

/opt/virgo/bin/startup.sh -debug -clean
