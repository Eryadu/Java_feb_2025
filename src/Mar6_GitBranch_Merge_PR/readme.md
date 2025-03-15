 git remote -v --- to check the current remote origin
 
## Branch

Pointer to a specific commit
-- Branches allow you to work on different parts of a project without impacting the main branch.
-- When the work is complete, a branch can be merged with the main project.
-- You can even switch between branches and work on different projects without them interfering with each other.
-- Branching in Git is very lightweight and fast!

main ---> Production -- directly available to end user
staging---> Pre-Production -- available to production team (internally user) not to end user, they make sure there is 
no bugs
feature ---> added features and commit
Develop (Qa/ test) ---> merge and test it


## command
## git branch branch_name

## git checkout -b branch_name -- to create and switch the branch at the same time 

## git pull

to fetch the remote changes to the local branch
-- Pulling to Keep up-to-date with Changes
When working as a team on a project, it is important that everyone stays up to date.
Any time you start working on a project, you should get the most recent changes to your local copy.
--pull is a combination of 2 different commands:

1. fetch
2. merge

-- Git Fetch
fetch gets all the change history of a tracked branch/repo.
So, on your local Git, fetch updates to see what has changed on GitHub.
-- Git Merge
merge combines the current branch, with a specified branch.

--GitPull
But what if you just want to update your local repository, without going through all those steps?
pull is a combination of fetch and merge. It is used to pull all changes from a remote repository into the branch you 
are working on.

## Pull Request [PR] , git bash - merge request

main - LOCKED staging - LOCKED feature

ask our teammates to approve our code before it can be merged to staging/main

## Diff betwn Pull and Pull request

Pull (git pull):

git pull is a command used to fetch changes from a remote repository and merge them into your local branch.
It combines two operations: git fetch (downloads changes from the remote) and git merge (integrates those changes into 
your local branch).

-- git pull origin main
This fetches changes from the main branch on the origin remote and merges them into your current branch.

Pull Request (PR):

A pull request is a feature provided by platforms like GitHub, GitLab, or Bitbucket to propose changes from one branch 
to another (e.g., from a feature branch to the main branch).
It is a collaborative tool that allows team members to review, discuss, and approve changes before they are merged.

-- git push origin feature/login
Go to the repository on GitHub/GitLab and create a pull request.
Team members review the changes, leave comments, and approve or request modifications.
Once approved, the changes are merged into the target branch (e.g., main).

Aspect	                        Pull (git pull)	                             Pull Request (PR)
Purpose	        Updates your local branch with remote changes.	     Proposes and reviews changes before merging.
Context	                Local development workflow.	                        Collaborative team workflow.
Automation	            Automatically merges changes.	                Requires manual review and approval.
Platform	                Git command-line tool.	                Feature of platforms like GitHub, GitLab, etc.
When Used	               Frequently during development.	        When ready to merge changes after development.

Example Workflow:

git checkout -b feature/new-feature

git add .
git commit -m "Add new feature"
Push your branch to the remote repository:
git push origin feature/new-feature

Create a pull request on GitHub to merge feature/new-feature into main.
While waiting for the PR to be approved, you use git pull to keep your local main branch up-to-date:

git checkout main
git pull origin main

In summary, git pull is a command for syncing changes, while a pull request is a collaborative process for reviewing and
merging changes. Both are essential for effective version control and team collaboration.


## Merge Conflict

A merge conflict occurs in version control systems (like Git) when two or more developers make changes to the same part 
of a file or codebase, and the system cannot automatically resolve the differences between them. 
This typically happens during a merge operation, such as when integrating changes from one branch into another.

-- Key Causes of Merge Conflicts:

-- Conflicting Changes: Two or more developers modify the same lines of code in different ways.
-- Deleted Files: One developer deletes a file while another modifies it.
-- Structural Changes: Changes to file names, directories, or other structural elements conflict with other changes.

-- How Merge Conflicts Manifest:
When a conflict occurs, the version control system flags the conflicting sections and asks the user to resolve them manually.

Copy
<<<<<<< HEAD
This is the change from the current branch.
=======
This is the change from the branch being merged.
>>>>>>> branch-name

Steps to Resolve Merge Conflicts:

-- Identify Conflicts: Use tools like git status to see which files have conflicts.
-- Open Conflicting Files: Manually edit the files to resolve the differences.
-- Remove Conflict Markers: Delete the <<<<<<<, =======, and >>>>>>> markers and ensure the code is correct.
-- Mark as Resolved: Use git add <file> to mark the conflict as resolved.
-- Complete the Merge: Run git commit to finalize the merge.

Tools to Help Resolve Conflicts:

-- IDE Integrations: Many IDEs (e.g., VS Code, IntelliJ) have built-in tools to visualize and resolve conflicts.
-- Diff Tools: Tools like meld, kdiff3, or Beyond Compare can help compare and merge changes.
-- Git Commands: Commands like git mergetool can launch external tools to assist in resolving conflicts.

Best Practices to Avoid Merge Conflicts:

-- Frequent Pulls: Regularly pull changes from the main branch to stay up-to-date.
-- Small Commits: Make smaller, more focused commits to reduce the likelihood of conflicts.
-- Communication: Coordinate with team members to avoid overlapping work on the same files.
-- Branching Strategy: Use a clear branching strategy (e.g., Git Flow) to manage changes effectively.

## Github WorkFlow

- Create a new Branch
- Make changes and add Commits
- Open a Pull Request
- Review
- Deploy
- Merge

## 8:37 Content modify in feature/branch to test merge conflict