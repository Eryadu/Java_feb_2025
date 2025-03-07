## Version control System

-- a type of tool which manages the code/project
multiple developers can collaborate and it manages the version also
or history

Version

18.4.6
18 - Major Version
4  - minor version
6  - patch


## Git --- is a distributed version control system which tracks and source code changes and allows
multiple developers to contribute on it at the same time.
-- Git is open source
-- Software tool - developed by linus Torvald

Git - tool/ software install on your local system, and it manages the repository( storage)

Github -  cloud based platform to host your code base
## Advantages of Gits

1. backup - redundancy
2. collaboration
3. history
4. check who made the specific change
5. parallel

## Brew is package manager which help to reduce number of commands to install Git as Git is a unix
based system, so it need a number of command to install

## Commands

-- git config --global user.name "yad"
    Command is used to set the global Git username on your system. 
    This username is associated with your commits and is used to identify who made the changes in a repository.
    --global: This flag sets the configuration globally, meaning it applies to all Git repositories on your system. 
       If you omit --global, the configuration will only apply to the current repository.
    --user.name: This specifies that you are setting the username.
    --"Your Name": Replace "Your Name" with your actual name (e.g., "John Doe").

-- Why is this important?
   When you make commits in Git, the username is recorded as part of the commit metadata. 
   This helps track who made the changes.
   If you don't set a username, Git will prompt you to configure it before allowing you to commit.

-- git config --global user.email yad@gmail.com

-- git config --global user.name ## to check global use name/email

-- git status --  git does not understand the repository

-- git init - to initialize the empty git repository
   to let git know to start tracking these files in that same directory

-- commit - snapshot of your changes
   commit hash -- unique id given to every commit

-- git add .
-- git commit -m "put a description of file"
-- git push

## git push -u origin main 
-- -u flag command is a shorthand for --set-upstream. 
It is used to set the upstream (tracking) reference for the current branch.
It does two things:
1.Pushes your local main branch to the remote repository (origin).
2.Sets the upstream (tracking) reference so that your local main branch tracks the remote main branch on origin.

Git will remember the relationship between your local branch and the remote branch. 
 -- Why is this useful?
It simplifies your workflow by eliminating the need to specify the remote and branch name every time you push or pull.
It ensures that your local branch stays in sync with the remote branch.

What happens if you don't use -u?

If you run without -u, your branch will still be pushed to the remote, but Git won't set up the tracking relationship. 
This means you'll need to explicitly specify origin main in future git push or git pull commands.

-- git branch --v  To check the upstream branch:

-- git rm --cached file_name // to untrack a file from git
-- git rm --cached .-r // for all files

-- git commit -amend-m "added more data" --> to mke change to current log message