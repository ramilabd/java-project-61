.DEFAULT_GOAL := build-run

clean:
	./gradlew clean

build:
	./gradlew clean build

install:
	./gradlew clean install

run-dist: install
	./app/build/install/app/bin/app

run:
	./gradlew run

test:
	./gradlew test

report:
	./gradlew jacocoTestReport

lint:
	./gradlew checkstyleMain

update-deps:
	./gradlew useLatestVersions


build-run: build run

.PHONY: build