
# Fetch iOS Project
#### By Daehee Hwang


----------------------
## Task

Create a native iOS app in Swift using only UIKit(no SwiftUI) that loads a list of dessert recipes in the API.
Then allow users to fetch the specific meal details by its ID.



## Description
###### The breakdown of the implementation of individual principles is marked with a comment above the said code.

The initial view is a UICollectionView made programatically, it pulls the list of the recipes in the Dessert caegory in the provided API with the JSON fetcher/decoder in the NetworkService file.
It lists them with its name and with the recipes' id.
When user clicks on the specific cell they want to see a detail of the program runs fetch on that specific API's id with a separate JSON fetcher/decoder

Detail view is made using storyboard for tighter UI.
and it loads all the necessary information on separate UI.

It handles null and empty values using optionals and conditionals for Strings and guard statements for functions.

## Installation

I have provided both the Xcode Workspace file and the ZIP of the Github repo.
Unpack either and run it on Xcode.
The application was tested on iPhone 11 and newer.

## Future Upgrades

Better UI
-View thumbnail images on the snapshot.
-Use framed webview to display and load the youtube video (may need SwiftUI)

Core Algo
-Systematically build JSON so it can adapt to API's change in key:value structure.
-Systematically build the detailed view using separate parser that loads the specific list of items in separate array. and programatically set the margins.
-Mirror the decoded JSON to fetch Key:Value pair to run tighter manipulations

## Usage
Copyright © 2022 Daehee Hwang
