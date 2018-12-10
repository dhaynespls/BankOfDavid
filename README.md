# BankOfDavid [![Build Status](https://travis-ci.com/dhaynespls/BankOfDavid.svg?branch=master)](https://travis-ci.com/dhaynespls/BankOfDavid)

This repo is an example Java project to be used as a reference point on how classes are strucutred in a library. In
addition, docs and tests are provided.

## Using Git

## 1) Install `git` on your system.

### On Linux Based Systems

**with apt:**

Open a terminal and run the following command:

    sudo apt update

This retrieves links to the most up-to-date and secure versions of your packages.

Next, with:

    sudo apt install git

you install `git` onto your system.

### On macOS

We recommend that you use the third party Homebrew package manager for macOS,
which allows you to install packages from your terminal just as easily as you
could on a Linux based system. You could use another package manager (or not
use one at all), but Homebrew is highly reccomended.

To get homebrew, run the following command in a terminal:

    /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)

**Note**: You do NOT need to use `sudo` when running any Homebrew commands, and
it likely won't work if you do.

Next, to make sure Homebrew is up to date, run:

    brew update

Finally we can install git with:

    brew install git
    
## 2) Clone the codebase

Now, we're going to clone down a copy of the codebase.

**a)** Configure your ssh keys by following the directions at:

[https://help.github.com/articles/adding-a-new-ssh-key-to-your-github-account/](https://help.github.com/articles/adding-a-new-ssh-key-to-your-github-account/).

**b)** Now, on your computer, navigate to the directory in which you want to download the project (ie. perhaps one called `development/SRCT`), and run

    git clone git@github.com:dhaynespls/BankOfDavid.git


## 3) Common git commands

Check out the resources on [http://try.github.io/](http://try.github.io/) for more information on how git works.

Get the status of the git repo:
```bash
git status
```

Commiting changes:
```$bash
git add --all
git commit
```

## Using IntelliJ

Once you have cloned the repo you can open the IDE and open the project from there.

## Doxygen

Documentation is handled by CI and is hosted at:

[https://dhaynespls.github.io/BankOfDavid/annotated.html](https://dhaynespls.github.io/BankOfDavid/annotated.html)

### Writing Code

All code is written in Java 11.

### Running Tests

You can configure IntelliJ to run unit tests by looking at the top right and hitting the dropdown to select the tests
to run. You will need to download the JUnit jar file.