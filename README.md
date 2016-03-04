# Elevens

## Getting started

Fork and clone the [Elevens repo](http://github.com/mvhs-apcs/Elevens).

Within the new folder, first setup the `upstream` repo so you can get new activity branches:
```
$ git remote add upstream https://github.com/mvhs-apcs/Elevens.git
```

Then create a branch that tracks with the original repo's activity 1 branch:
```
$ git fetch upstream a1
$ git checkout -b a1 upstream/a1
```

This should give you all of the code necessary for activity 1.

Read the instructions in `Elevens Lab Student Guide.pdf`.

`answers.md` has been provided for you to write the answers to any questions asked in the Student Guide.

Make commits to this branch as you complete the steps outlined in the activity.

## Submitting

Commit all local changes, then (replace # with the current activity number):
```
$ git push origin a#
```

## Switching to the next activity

The activities have not all been pushed at the start of the lab because each activity builds on the next and sometimes has working versions of the problems from the previous activities.

To move to the next activity, show your completed solution to your instructor. He will then push a branch for you to use for the next activity. The branch name will be formatted like this: `<your github username>-a#`. For example, Abe Lincoln would move to activity 4 with this command:
```
$ git fetch upstream four_score-a4
$ git checkout -b a4 upstream/four_score-a4
```